package test;
import java.util.Arrays;
import java.util.Scanner;

public class homework6 {

	public static void main(String[] args) {
		System.out.print("10진수 4자리를 입력해 주세요.: ");
		Scanner s = new Scanner(System.in);
		int input;
		int []a = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		input = s.nextInt();
		if(input / 2 > 0) {
			a[13] = input % 2;
			input /= 2;
			if(input / 2 >= 0) {
				a[12] = input % 2;
				input /= 2;
				if(input / 2 >= 0) {
					a[11] = input % 2;
					input /= 2;
					if(input / 2 >= 0) {
						a[10] = input % 2;
						input /= 2;
						if(input / 2 >= 0) {
							a[9] = input % 2;
							input /= 2;
							if(input / 2 >= 0) {
								a[8] = input % 2;
								input /= 2;
								if(input / 2 >= 0) {
									a[7] = input % 2;
									input /= 2;
									if(input / 2 >= 0) {
										a[6] = input % 2;
										input /= 2;
										if(input / 2 >= 0) {
											a[5] = input % 2;
											input /= 2;
											if(input / 2 >= 0) {
												a[4] = input % 2;
												input /= 2;
												if(input / 2 >= 0) {
													a[3] = input % 2;
													input /= 2;
													if(input / 2 >= 0) {
														a[2] = input % 2;
														input /= 2;
														if(input / 2 >= 0) {
															a[1] = input % 2;
															input /= 2;
															if(input / 2 >= 0) {
																a[0] = input % 2;
																input /= 2;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
		System.out.println(Arrays.toString(a));
			}
		}