package start;

import javax.swing.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.tests.*;

public class MainGUI {
	WebDriver driver = new ChromeDriver();
	JFrame f;
	JButton b1, b2, b3, b4, b5, b6, b7, b8;

	MainGUI() {

		f = new JFrame("Testing Website Izlet");
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);

		b1 = new JButton("Automation Registration Test");
		b1.setBounds(50, 50, 400, 30);

		b2 = new JButton("Manual Registration Test");
		b2.setBounds(50, 100, 400, 30);

		b3 = new JButton("Automation Login Test");
		b3.setBounds(50, 150, 400, 30);

		b4 = new JButton("Manual Login Test");
		b4.setBounds(50, 200, 400, 30);

		b5 = new JButton("Automation Post Creating");
		b5.setBounds(50, 250, 400, 30);

		b6 = new JButton("Manual Post Creating");
		b6.setBounds(50, 300, 400, 30);

		b7 = new JButton("Edit Post");
		b7.setBounds(50, 350, 400, 30);

		b8 = new JButton("Delete Post");
		b8.setBounds(50, 400, 400, 30);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);

		b1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b1ActionPerformed(evt);
			}
		});

		b2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b2ActionPerformed(evt);
			}
		});
		b3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b3ActionPerformed(evt);
			}
		});
		b4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b4ActionPerformed(evt);
			}
		});
		b5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b5ActionPerformed(evt);
			}
		});
		b6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b6ActionPerformed(evt);
			}
		});
		b7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b7ActionPerformed(evt);
			}
		});
		b8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				b8ActionPerformed(evt);
			}
		});

	}

	private void b1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			HomePageTest.testOpenHomePage(driver);
			RegistrationPageTest.excelRegistration(driver);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	private void b2ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			HomePageTest.testOpenHomePage(driver);
			RegistrationPageTest.scannerRegistration(driver);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	private void b3ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			HomePageTest.testOpenHomePage(driver);
			LoginPageTest.excelLogin(driver);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	private void b4ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			HomePageTest.testOpenHomePage(driver);
			LoginPageTest.scannerLogin(driver);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	private void b5ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			HomePageTest.testOpenHomePage(driver);
			LoginPageTest.scannerLogin(driver);
			PostPageTest.excelNewPost(driver);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	private void b6ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			HomePageTest.testOpenHomePage(driver);
			LoginPageTest.scannerLogin(driver);
			PostPageTest.scannerNewPost(driver);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	private void b7ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			HomePageTest.testOpenHomePage(driver);
			LoginPageTest.scannerLogin(driver);
			EditPostTest.scannerEditPost(driver);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	private void b8ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			HomePageTest.testOpenHomePage(driver);
			LoginPageTest.scannerLogin(driver);
			DeletePostTest.scannerDeletePost(driver);
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			driver.quit();
		}
	}

	public static void main(String[] args) {
		MainGUI m = new MainGUI();

	}
}