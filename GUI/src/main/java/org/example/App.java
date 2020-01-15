package org.example;

import javax.swing.JButton;
import javax.swing.JFrame;


public class App {

  public static void main(String[] args) {
    // 主窗体JFrame，是GUI中的容器，存放各种组件
    JFrame jFrame = new JFrame("App");
    // 主窗体 尺寸设计
    jFrame.setSize(400, 300);
    // 位置坐标 设置
    jFrame.setLocation(200, 200);
    // 组件 布局 设置为绝对定位
    jFrame.setLayout(null);

    // JButton 组件-按钮
    JButton jButton = new JButton("Button to click");
    // 设置组件 位置坐标 和 尺寸大小
    jButton.setBounds(50, 50, 280, 30);
    // 将 组件 添加进 主窗体 中
    jFrame.add(jButton);

    // 关闭窗体时 退出程序; JFrame.EXIT_ON_CLOSE = 3
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    jFrame.setDefaultCloseOperation(3);
    // 让 窗体 设置为 可见，
    // .setVisible(true); 会对所有的组件进行渲染，所以一定要放在最后面
    jFrame.setVisible(true);
  }
}
