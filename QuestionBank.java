import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.swing.*;

public class QuestionBank {

	private Integer orderNum;// 題號
	private String degree;
	private String title;// 題幹
	private String[] option;// 選項
	private String answer;// 答案

	public QuestionBank(String degree, String title, String[] option, String answer) {
		this.degree = degree;
		this.title = title;
		this.option = option;
		this.answer = answer;
	}

	@Override
	public int hashCode() {
		// 返回题干字符串的 hashcode
		return this.title.hashCode();
	}

	public void setOption(String[] str) {
		this.option = str;
	}

	public String[] getOption() {
		return this.option;
	}

	public void setAnswer(String str) {
		this.answer = str;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setOrderNum(int num) {
		this.orderNum = num;
	}

	public int getOrderNum() {
		return this.orderNum;
	}

	public String getDegree() {
		return this.degree;
	}

	public String getTitle() {
		return this.title;
	}
}
