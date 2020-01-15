package org.zjl_.thread.practice;

public class OddNum implements Runnable {
    private int sum = 200;
//    boolean flag = true;
    @Override
    public void run() {
        while (sum < 400) {
            synchronized ("abc") {

					/*if(!flag) {
						break;
					}*/
                if (sum > 399) {
                    break;
                }
                sum++;
                if (sum % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + " " + sum);
//                    if (sum >= 199) {
//                        flag = false;
//                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}