package com.lonkal.convexhullapp.main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConvexHullApp {

	public JFrame mainFrame;

	public static final int WIDTH = 800;
	public static final int HEIGHT = 800;

	public static void main(String[] args) {
		initializeGUI();
	}

	private static void initializeGUI() {
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("ConvexHullApp");
		mainFrame.setLayout(new BorderLayout());
		mainFrame.setVisible(true);
		mainFrame.setSize(WIDTH, HEIGHT);

		GraphPanel graphPanel = new GraphPanel();
		mainFrame.add(graphPanel, BorderLayout.CENTER);

		JPanel toolbarPanel = new JPanel();
		JButton addRandomButton = new JButton("Generate Random Points");
		JButton clearButton = new JButton("Clear");
		JButton computeCHButton = new JButton("Compute Convex Hull");
		JButton stopButton = new JButton("Stop");
		JButton resumeButton = new JButton("Resume");
		
		addRandomButton.addActionListener(new RandomButtonListener(graphPanel));
		clearButton.addActionListener(new ClearButtonListener(graphPanel));
		computeCHButton.addActionListener(new ComputeCHButton(graphPanel));
		stopButton.addActionListener(new StopButtonListener(graphPanel));
		resumeButton.addActionListener(new ResumeButtonListener(graphPanel));
		
		toolbarPanel.add(computeCHButton);
		toolbarPanel.add(addRandomButton);
		toolbarPanel.add(clearButton);
		toolbarPanel.add(resumeButton);
		toolbarPanel.add(stopButton);

		mainFrame.add(toolbarPanel, BorderLayout.SOUTH);
	}
}
