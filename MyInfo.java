import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MyInfo extends JFrame implements ListSelectionListener, ActionListener{
	//멤버변수 선언
	String[] year= {"2005","2006","2007","2008","2009"};
	Integer[] month=new Integer[12];
	String[] day=new String[31];
	JPanel p0;
	
	Font defaultFont=new Font("굴림",Font.BOLD,20);
	
	//리스트 생성
	JList<String> listYear=new JList<>(year);
	JList<Integer> listMonth=new JList<>(month);
	JList<String> listDay=new JList<>(day);
	
	//라디오 버튼
	JRadioButton radio_male=new JRadioButton("남자");
	JRadioButton radio_female=new JRadioButton("여자");
	
	//sample 레이블 선언
	JLabel sample=new JLabel("20516");
	
	//CheckBox 생성
	JCheckBox check_agree=new JCheckBox("개인정보 제공에 동의합니다.");
	
	//버튼생성
	JButton btnOk=new JButton("확인");
	JButton btnNo=new JButton("취소");
	
	//이 함수는 기본 화면 디자인을 만들어 줍니다.(교사제공)
	private void 선생님_제공_기초화면() {
		setTitle("수행평가 연습");
		setBounds(0, 0, 450, 500);
		setTitle("수행평가 연습");

		p0 = new JPanel(null);
		add(p0);
		
		//월, 일 표현에는 스크롤이 필요합니다.
		JScrollPane scrollPane1 = new JScrollPane(listMonth);
		JScrollPane scrollPane2 = new JScrollPane(listDay);

		// 리스트
		listYear.setBounds(10, 30, 90, 160);
		scrollPane1.setBounds(120, 30, 90, 160);
		scrollPane2.setBounds(220, 30, 90, 160);

		//라디오 버튼 생성
        radio_male.setBounds(320, 30, 80, 50);
        radio_female.setBounds(320, 80, 80, 50);
	    radio_male.setFont(defaultFont);
	    radio_female.setFont(defaultFont);
	    radio_male.setSelected(true);
	    
		//라벨
		sample.setBounds(10, 180, 500, 50);
		sample.setFont(defaultFont);

		//CheckBox
		check_agree.setBounds(10, 300, 500, 50);
		check_agree.setFont(defaultFont);
		
		//버튼 2개
		btnOk.setBounds(100, 360, 80, 20);
		btnNo.setBounds(200, 360, 80, 20);
		//모든 항목 패널에 더하기
		
		p0.add(listYear);
		p0.add(scrollPane1);
		p0.add(scrollPane2);
        p0.add(radio_male);
        p0.add(radio_female);
		p0.add(sample);
		p0.add(check_agree);
		p0.add(btnOk);
		p0.add(btnNo);
		

		//화면이 열리면 첫 항목 강제 선택 
		listYear.setSelectedIndex(0);
		listMonth.setSelectedIndex(0);
		listDay.setSelectedIndex(0);
	}
	
	public static void main(String[] args) {
		new MyInfo();
	}
	MyInfo(){
		//1.JList에 항목을 추가하는 코드 작성
		for (int i=0;i<12;i++) 
			month[i]=i+1;
		for (int i=0;i<31;i++)
			day[i]=Integer.toString(i+1);
//		for (int i = 1; i <= 12; i++) {
//            month[i - 1] = i;
//        }
//
//        for (int i = 1; i <= 31; i++) {
//            day[i - 1] = String.valueOf(i);
//        }
		//2.라디오 버튼을 그룹에 추가하여 하나면 선택되도록 코드 작성 
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radio_male);
        buttonGroup.add(radio_female);
		//화면 디자인
		선생님_제공_기초화면();
		
		//3. 이벤트   (2개)
		listYear.addListSelectionListener(this);
		listMonth.addListSelectionListener(this);
		listDay.addListSelectionListener(this);
		
		radio_male.addActionListener(this);
		radio_female.addActionListener(this);
		btnOk.addActionListener(this);
		btnNo.addActionListener(this);
		
		
		
//		btnOk.addActionListener(new ActionListener() {
//	            @Override
//	            public void actionPerformed(ActionEvent e) {
//	                // "확인" 버튼 클릭 시 실행되는 코드
//	                String selectedYear = listYear.getSelectedValue();
//	                Integer selectedMonth = listMonth.getSelectedValue();
//	                String selectedDay = listDay.getSelectedValue();
//	                String gender = radio_male.isSelected() ? "남자" : "여자";
//	                boolean agree = check_agree.isSelected();
//
//	                // 선택된 항목들을 콘솔에 출력
//	                System.out.println("선택된 연도: " + selectedYear);
//	                System.out.println("선택된 월: " + selectedMonth);
//	                System.out.println("선택된 일: " + selectedDay);
//	                System.out.println("선택된 성별: " + gender);
//	                System.out.println("체크박스 상태: " + (agree ? "동의함" : "동의안함"));
//
//	                // 선택된 항목들을 JLabel에 표시
//	                sample.setText(selectedYear + "년 " + selectedMonth + "월 " + selectedDay + "일 " + gender);
//	            }
//	        });
//
//	        listYear.addListSelectionListener(new ListSelectionListener() {
//	            @Override
//	            public void valueChanged(ListSelectionEvent e) {
//	                // 연도가 선택될 때마다 JLabel에 표시
//	                sample.setText(listYear.getSelectedValue() + "년 " + listMonth.getSelectedValue() + "월 " + listDay.getSelectedValue() + "일 " + (radio_male.isSelected() ? "남자" : "여자"));
//	            }
//	        });
//
//	        listMonth.addListSelectionListener(new ListSelectionListener() {
//	            @Override
//	            public void valueChanged(ListSelectionEvent e) {
//	                // 월이 선택될 때마다 JLabel에 표시
//	                sample.setText(listYear.getSelectedValue() + "년 " + listMonth.getSelectedValue() + "월 " + listDay.getSelectedValue() + "일 " + (radio_male.isSelected() ? "남자" : "여자"));
//	            }
//	        });
//
//	        listDay.addListSelectionListener(new ListSelectionListener() {
//	            @Override
//	            public void valueChanged(ListSelectionEvent e) {
//	                // 일이 선택될 때마다 JLabel에 표시
//	                sample.setText(listYear.getSelectedValue() + "년 " + listMonth.getSelectedValue() + "월 " + listDay.getSelectedValue() + "일 " + (radio_male.isSelected() ? "남자" : "여자"));
//	            }
//	        });
		//화면 보이기
		setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//선택이 바뀔때마다 변경된 값을 sample에 표시
		chageSample();
		// 4.확인버튼, 취소버튼
		if(e.getSource()==btnOk) {
			if(check_agree.isSelected()==false)
				JOptionPane.showMessageDialog(null, "개인정보제공에 동의해주세요.");
			else	{
				JOptionPane.showMessageDialog(null, "감사합니다.");
			}
		}
		else if(e.getSource()==btnNo) {dispose();}
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		//선택이 바뀔때마다 변경된 값을 sample에 표시
		chageSample();
		
	}

	private void chageSample() {
		//5.함수 내부 작성하기
		String y=listYear.getSelectedValue();
		Integer m=listMonth.getSelectedValue();
		String d=listDay.getSelectedValue();
		
		String info="생년월일:"+y+"년"+m+"월"+d+"일";
		
		if(radio_male.isSelected())
			info="성별:"+"남자"+info;
		else if(radio_female.isSelected())
			info="성별:"+"여자"+info;
		
		sample.setText(info);
		
	}

}
