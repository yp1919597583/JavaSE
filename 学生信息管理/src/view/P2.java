package view;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.connenct;
import model.Student;

import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class P2 extends JPanel {
	private JTable table;
	JScrollPane JP;
	private ArrayList<Student> AL;

	String[] sx= {"学号","姓名","数学成绩","物理成绩","英语成绩"};
	Object[][] show= new Object[50][50];

	public void add() {
	//将列表中的学生对象取出放入二维数组
		for (int x=0;x<AL.size();x++) {
			for (int i = 0; i <1; i++) {
				show[x][i]=AL.get(x).getId();
				show[x][i+1]=AL.get(x).getName();
				show[x][i+2]=AL.get(x).getMath();
				show[x][i+3]=AL.get(x).getPhysical();
				show[x][i+4]=AL.get(x).getEnglish();
			
			}	
		}
		
	}
	
	public void clear() {
		for (int x=0;x<show.length;x++) {
			for (int i = 0; i <show[x].length; i++) {
				show[x][i]=null;
			
			}	
		}
	}

	DefaultTableModel  defaultTableModel=new DefaultTableModel(null,sx);
	public P2() {
		
		connenct con=new connenct();
		AL=con.select();
		
		add();
	

	for (Object[] objects : show) {
		if (objects[0]!=null) {
			defaultTableModel.addRow(objects);
		}
	}

		setBorder(new EmptyBorder(5, 5, 5, 5));
		//setBounds(100, 100, 450, 300);
		setLayout(new BorderLayout());
		
		
		table = new JTable(defaultTableModel);
		table.setEnabled(false);
		table.setBounds(10, 10, 430, 235);
		table.setShowHorizontalLines(true);
		table.setShowVerticalLines(true);
		//table.setModel();
		add(table.getTableHeader(), BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("\u5237\u65B0");
		add(btnNewButton, BorderLayout.SOUTH);

		 JP=new JScrollPane(table);
		add(JP, BorderLayout.CENTER);
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
	//重置
			AL.clear();
			clear();
			connenct con=new connenct();
			AL=con.select();
			add();
		for (Object[] objects : show) {
			if (objects[0]!=null) {
				defaultTableModel.addRow(objects);
				
			}
		}
		//重新设定字段和数据
		defaultTableModel.setDataVector(show, sx);
	
			}
		});

	}
	}
