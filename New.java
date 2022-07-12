import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
public class New extends Frame implements ActionListener
{

TextField t1, t2,t3,t4;    
Button b1;
Label l1,l2,l3,l4,l5;
TextField p1,p2,p3,p4; 
TextField a1,a2,a3,a4; 
New()
{


setSize(6000,6000);    
setLayout(null);    
setVisible(true);   
setBackground(Color.BLACK); 
 
t1 = new TextField();    
t1.setBounds(100, 200, 80, 80);    
t2 = new TextField();    
t2.setBounds(100, 280, 80, 80);  
t3 = new TextField();
t3.setBounds(180,200,80,80);
t4 = new TextField();
t4.setBounds(180,280,80,80);

l1 = new Label("X");
l1.setBounds(375,240,80,80);
l2 = new Label("=");
l2.setBounds(775,240,80,80);
l3=new Label("MATRIX 1");
l3.setBounds(100,100,100,100);
l4=new Label("MATRIX 2");
l4.setBounds(500,100,100,100);
l5=new Label("SOLUTION");
l5.setBounds(1000,100,105,105);

p1 = new TextField();    
p1.setBounds(500, 200, 80, 80);    
p2 = new TextField();    
p2.setBounds(500, 280, 80, 80);  
p3 = new TextField();
p3.setBounds(580,200,80,80);
p4 = new TextField();
p4.setBounds(580,280,80,80);

a1 = new TextField();    
a1.setBounds(1000, 200, 80, 80);    
a2 = new TextField();    
a2.setBounds(1000, 280, 80, 80);  
a3 = new TextField();
a3.setBounds(1080,200,80,80);
a4 = new TextField();
a4.setBounds(1080,280,80,80);

b1 = new Button("Submit");

b1.setBounds(150,500,100,30);
b1.setBackground(Color.WHITE);

b1.addActionListener(this); 

l1.setFont(new Font("Serif", Font.BOLD, 48));
l2.setFont(new Font("Serif", Font.BOLD, 48));
l3.setFont(new Font("Serif", Font.BOLD, 20));
l4.setFont(new Font("Serif", Font.BOLD, 20));
l5.setFont(new Font("Serif", Font.BOLD, 20));

l1.setForeground(Color.white);
l2.setForeground(Color.white);
l3.setForeground(Color.white);
l4.setForeground(Color.white);
l5.setForeground(Color.white);

add(t1);  
add(t2);
add(t3);
add(t4); 

add(p1);
add(p2);
add(p3);
add(p4);

add(a1);
add(a2);
add(a3);
add(a4);

add(l1);
add(l2); 
add(l3);
add(l4);
add(l5);

add(b1);

addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent we)
{
System.exit(0);
}
});
}//new
 

public void actionPerformed(ActionEvent e)
{

String tx1= t1.getText();
String tx2= t2.getText();
String tx3= t3.getText();
String tx4= t4.getText();

int arr1 [][] = new int[2][2];
arr1 [0] [0]=Integer.parseInt(tx1);
arr1 [1] [0]=Integer.parseInt(tx2);
arr1 [0] [1]=Integer.parseInt(tx3);
arr1 [1] [1]=Integer.parseInt(tx4);

String px1= p1.getText();
String px2= p2.getText();
String px3= p3.getText();
String px4= p4.getText();

int arr2 [][] = new int[2][2];
arr2 [0] [0]=Integer.parseInt(px1);
arr2 [1] [0]=Integer.parseInt(px2);
arr2 [0] [1]=Integer.parseInt(px3);
arr2 [1] [1]=Integer.parseInt(px4);

System.out.println("Matrix 1 is:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.printf("%d ",arr1[i][j]);
}
System.out.println();
}

System.out.println("Matrix 2 is:");
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.printf("%d ",arr2[i][j]);
}
System.out.println();
}

int arr [][]={{0,0},{0,0}};

for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
//arr[i][j]=0;
for(int k=0;k<2;k++)
{
arr[i][j]+=(arr1[i][k]*arr2[k][j]);
}
}
}

String ax1=String.valueOf(arr[0][0]);
String ax2=String.valueOf(arr[0][1]);
String ax3=String.valueOf(arr[1][0]);
String ax4=String.valueOf(arr[1][1]);

if(e.getSource()==b1)
{

a1.setText(ax1);
a2.setText(ax2);
a3.setText(ax3);
a4.setText(ax4);

}


}//actionPerformed

 
 

public static void main(String args[])

{
new New();

}//main

}//class

