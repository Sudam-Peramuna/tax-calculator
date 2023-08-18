import java.util.*;
import java.lang.Math;
class TaxCalculator{
	public static void main(String ars[]){
		menu();
		}
	public static void menu(){	
		printFirstPage();
		int inputValue = getKeybordInput();
		basedOnFirstInput(inputValue);
	}
	public static int getKeybordInput(){
		
		Scanner input=new Scanner(System.in);
		int inputValue = input.nextInt();
		return inputValue;
		}
	public static char getKeybordInputChar(){
		Scanner input=new Scanner(System.in);
		char inputChar = input.next().charAt(0);
		return inputChar;
		}
	
	public final static void clearConsole() { 
           try {
           final String os = System.getProperty("os.name"); 
             if (os.contains("Windows")) {
               new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
             } else {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
            }
            } catch (final Exception e) {
             e.printStackTrace();
             }
    }
		
	//-----------printFirstPage---------------------
	public static void printFirstPage(){
		
System.out.println("                               ______   ______   ________  ________                   ");
System.out.println("                              /      | /      \\ /        |/        |                 ");
System.out.println("                              $$$$$$/ /$$$$$$  |$$$$$$$$/ $$$$$$$$/                   ");
System.out.println("                                $$ |  $$ |  $$/ $$ |__       $$ |                     ");
System.out.println("                                $$ |  $$ |      $$    |      $$ |                     ");
System.out.println("                                $$ |  $$ |   __ $$$$$/       $$ |                     ");
System.out.println("                               _$$ |_ $$ \\__/  |$$ |_____    $$ |                    ");
System.out.println("                              / $$   |$$    $$/ $$       |   $$ |                     ");
System.out.println("                              $$$$$$/  $$$$$$/  $$$$$$$$/    $$/                      ");
		
System.out.println("  _______       __   __   _____          _      _____ _    _ _            _______ ____  _____                 ");
System.out.println(" |__   __|/\\    \\ \\ / /  / ____|   /\\   | |    / ____| |  | | |        /\\|__   __/ __ \\|  __ \\         ");
System.out.println("    | |  /  \\    \\ V /  | |       /  \\  | |   | |    | |  | | |       /  \\  | | | |  | | |__) |           ");
System.out.println("    | | / /\\ \\    > <   | |      / /\\ \\ | |   | |    | |  | | |      / /\\ \\ | | | |  | |  _  /          ");
System.out.println("    | |/ ____ \\  / . \\  | |____ / ____ \\| |___| |____| |__| | |____ / ____ \\| | | |__| | | \\ \\          ");
System.out.println("    |_/_/    \\_\\/_/ \\_\\  \\_____/_/    \\_\\______\\_____|\\____/|______/_/    \\_\\_|  \\____/|_|  \\_\\ ");	
System.out.println("	                                                                                                          ");	
System.out.println("		                                                                                                      ");
System.out.println("	                                                                                                          ");	
System.out.println("		                                                                                                      ");		
		
		
		
		
		System.out.println("[1] Withholding Tax");
		System.out.println("[2] Payble Tax");
		System.out.println("[3] Income Tax");
		System.out.println("[4] Social security Contribution Levy(SSCL) Tax");
		System.out.println("[5] Leasing Payment");
		System.out.println("[6] Exit");
		System.out.print("Enter option to continue -->");
		}
	
	
	public static void basedOnFirstInput(int value){
		if(value==1){
			withholdingTaxPage();
			}else if(value==2){
				paybleTaxPage();
				}
				else if(value==3){
					incomeTaxPage();
					}else if(value==4){
						ssclTaxPage();	
						}else if(value==5){
							leasingTaxPage();
						}else{
							clearConsole();
						
							}
	
	}
	//-----------Start withholding tax page-----------
	public static void withholdingTaxPage(){
	System.out.println("+---------------------------------------+");	
	System.out.println("|          WITHHOLDING TAX              |");	
	System.out.println("+---------------------------------------+");
	
		System.out.println("[1] Rent Tax");
		System.out.println("[2] Bank interst Tax");
		System.out.println("[3] Dividend Tax");
		System.out.println("[4] Exit");
		System.out.print("Enter option tocontinue -->");
		int inputValue = getKeybordInput();
		if(inputValue==1){
			rentTaxPage();
			}else if(inputValue==2){
				bankInterestTaxPage();
				}else if(inputValue==3){
					dividendTaxPage();
					}else{
						clearConsole();
						menu();
				
						}
				
		}
	public static void rentTaxPage(){
    System.out.println("+---------------------------------------+");	
	System.out.println("|             RENT TAX                  |");	
	System.out.println("+---------------------------------------+");	
		System.out.print("Enter your rent : ");
		int rentAmount=getKeybordInput();
		if(rentAmount>100000){
			double rentTax=0.1*rentAmount;
			System.out.println("You have to pay Rent Tax :" + rentTax);
			}
		else if(rentAmount<0){
			System.out.println("invalid Input...");
			}else{
				System.out.println("You don't have to pay Rent Tax..");
				}
				System.out.print("Do you want to calculate another Rent Tax (Y/N):");
		char inputChar = getKeybordInputChar();
		if (inputChar=='y'| inputChar=='Y' ){
			rentTaxPage();
			}else{
			clearConsole();
			withholdingTaxPage();
	        }
		        
		}
	public static void bankInterestTaxPage(){	
    System.out.println("+---------------------------------------+");	
	System.out.println("|            BANK INTEREST TAX          |");	
	System.out.println("+---------------------------------------+");
	System.out.print("Enter your bank interest per year : ");		
	int interestAmount=getKeybordInput();
	double interestTax=0.05*interestAmount;
	System.out.println("You have to pay Bank interest Tax per year : "+interestTax);
	
	System.out.print("Do you want to calculate another Interest Tax (Y/N):");
     char inputChar = getKeybordInputChar();
	 if (inputChar=='y'| inputChar=='Y' ){
			bankInterestTaxPage();
			}else{
			clearConsole();
			withholdingTaxPage();
	        }
	}
    
    public static void dividendTaxPage(){
	System.out.println("+---------------------------------------+");	
	System.out.println("|             DIVIDEND TAX              |");	
	System.out.println("+---------------------------------------+");
	System.out.print("Enter your total dividend per year : ");	
	int dividendAmount=getKeybordInput();
	  if(dividendAmount>100000){
			double dividentTax=0.14*dividendAmount;
			System.out.println("You have to pay Dividend Tax : " + dividentTax);
	  }else if(dividendAmount<0){
			System.out.println("invalid Input...");
			}else{
				System.out.println("You don't have to pay Dividend Tax..");
				}
		System.out.print("Do you want to calculate another Dividend Tax (Y/N):");
		char inputChar = getKeybordInputChar();
		if (inputChar=='y'| inputChar=='Y' ){
			dividendTaxPage();
			}else{
			clearConsole();
			withholdingTaxPage();
	        }
		
	}
	    
//---------------------------End of withholding page-------------	

//--------------------Start payble tax page------------------

     public static void paybleTaxPage(){
      System.out.println("+---------------------------------------+");	
	  System.out.println("|             PAYBLE TAX                |");	
	  System.out.println("+---------------------------------------+");
	  System.out.print("Enter your employee payment per month : ");
		 int paybleAmount=getKeybordInput();
		double paybleTax=0;
		 if(paybleAmount>308333){
			  paybleTax=0.36*paybleAmount;
			 }else if(paybleAmount>266667){
				  paybleTax=0.3*paybleAmount;
				 }else if(paybleAmount>225000){
					  paybleTax=0.24*paybleAmount;
					 }else if(paybleAmount>183333){
						  paybleTax=0.18*paybleAmount;
						 }else if(paybleAmount>141667){
							  paybleTax=0.12*paybleAmount;
							 }else if(paybleAmount>100000){
								 paybleTax=0.06*paybleAmount; 
							 }
		System.out.println("You have to pay payble tax per month : "+paybleTax);
		if(paybleAmount<0){
		System.out.println("invalid Input..."); 
		}else if(paybleAmount<100000){
		System.out.println("You don't have to pay Payble Tax..");
	     }
		 
		 System.out.print("Do you want to calculate another paypayble tax (Y/N) :");
		char inputChar = getKeybordInputChar();
		if (inputChar=='y'| inputChar=='Y' ){
			paybleTaxPage();
			}else{
			clearConsole();
			menu();
	        }
	}
	
//-------------------------End PaybleTax Page-------------------------

//-------------------------Start income Tax Page---------------------
     public static void incomeTaxPage(){
      System.out.println("+---------------------------------------+");	
	  System.out.println("|             INCOME TAX                |");	
	  System.out.println("+---------------------------------------+");
      System.out.print("Enter your annual income per year : ");
	  int incomeAmount=getKeybordInput();
	  double incomeTax=0;
	   if(incomeAmount>3700000){
		   incomeTax=0.36*incomeAmount;
		   }else if(incomeAmount>3200000){
			   incomeTax=0.3*incomeAmount;
			   }else if(incomeAmount>2700000){
				     incomeTax=0.24*incomeAmount;
				   }else if(incomeAmount>2200000){
					    incomeTax=0.18*incomeAmount;
					   }else if(incomeAmount>1700000){
						  incomeTax=0.12*incomeAmount; 
						   }else if(incomeAmount>1200000){
							   incomeTax=0.06*incomeAmount; 
							   }
	  System.out.println("You have to pay incomeTax tax per month : "+incomeTax);				   
	  if(incomeAmount<0){
	  System.out.println("invalid Input..."); 
	  }else if(incomeAmount<1200000){
	  System.out.println("You don't have to pay incomeTax Tax..");
       }
		 System.out.print("Do you want to calculate another income Tax (Y/N):");
		char inputChar = getKeybordInputChar();
		if (inputChar=='y'| inputChar=='Y' ){
			incomeTaxPage();
			}else{
			clearConsole();
			menu();
	        }
	} 
	
	//--------------------Start ssclTaxPage---------------	
	public static void ssclTaxPage(){
	 System.out.println("+----------------------------------------------+");	
	 System.out.println("|  SOCIAL SECURITY CONTRIBUTION LEVY(SSCL) TAX |");	
	 System.out.println("+----------------------------------------------+");
			System.out.print("Enter value of good or service : ");	
			int valueOfGoods=getKeybordInput();
			
			double salesTax=0.025*valueOfGoods;
			double taxAdd=salesTax+valueOfGoods;
			System.out.println("Value of goods (after saletax added) : "+salesTax);
			
			double salesTaxVat=taxAdd*0.15;
			
			double total=salesTax+salesTaxVat;
			System.out.println("Total SSCL Tax ="+salesTax+" + "+salesTaxVat+" = "+total);
			System.out.print("Do you want to calculate another (SSCL) TAX  (Y/N):");
		char inputChar = getKeybordInputChar();
		if (inputChar=='y'| inputChar=='Y' ){
			ssclTaxPage();
			}else{
			clearConsole();
			menu();
	        }
	}
			
	//----------------------------End ssclTaxPage--------------
		
	//--------------------------Start leasingTaxPage--------------	
	
	public static void leasingTaxPage(){
	 System.out.println("+---------------------------------------+");	
	 System.out.println("|           LEASING PAYMENT             |");	
	 System.out.println("+---------------------------------------+");
		System.out.println("[1] Calculate monthly Installment");
		System.out.println("[2] Search Leasing Category");
		System.out.println("[3] Find Leasing Amount");
		System.out.println("[4] Exit");
		System.out.print("Enter option to continue -->");
	    int inputValue2 = getKeybordInput();
	    if(inputValue2==1){
			monthlyInstallmentPage();
			}else if(inputValue2==2){
				searchLeasingPage();
				}else if(inputValue2==3){
					findLeasingPage();
					}else{
						clearConsole();
						menu();
						}
			
	 }
	 //----------------------start monthlyInstallmentPage---------------
	 public static void monthlyInstallmentPage(){
	  System.out.println("+---------------------------------------------+");	
	  System.out.println("|         CALCULATE LEASING PAYMENT           |");	
	  System.out.println("+---------------------------------------------+");
	  System.out.print("Enter Lease amount : ");
		int leaseAmount = getKeybordInput(); 
	  System.out.print("Enter annual interest rate : ");	
		int interestRate = getKeybordInput();
	  System.out.print("Enter number of years : ");
	    int years = getKeybordInput();
	    if(years<5){
			calculation(leaseAmount,interestRate,years);
			}else{
				calculateMonthlyInstallment(leaseAmount,interestRate);
				}
	}
	 public static void calculateMonthlyInstallment(int leaseAmount,int interestRate){
	    System.out.println("Wrong input try again...");
	    System.out.println("Enter number of years : ");
	    int years = getKeybordInput();
	    if(years>5){
			calculateMonthlyInstallment(leaseAmount,interestRate);
			}else{
	    calculation(leaseAmount,interestRate,years);
	        }
	}
	 public static void calculation(int leaseAmount,int interestRate, int years){
		double i=(double)interestRate/12;
	    int n=12*years;
	    double Pn = Math.pow((1+i),n);
	    double monthlyInstallment=(double)leaseAmount*i /(1-(1/Pn));
	    System.out.println("monthlyInstallment : "+monthlyInstallment);
	    
	    System.out.print("Do you want to calculate another Leasing Tax ?(Y/N):");
	    char inputChar = getKeybordInputChar();
		if (inputChar=='y'| inputChar=='Y' ){
			monthlyInstallmentPage();
			}else{
			clearConsole();
			leasingTaxPage();
	        }
	}
		 
		 
	 //-------------------end monthlyInstallmentPage-----------------
	 
	 //--------------------start searchLeasingCategory-------------
	 public static void searchLeasingPage(){
      System.out.println("+---------------------------------------------+");	
	  System.out.println("|         Search Leasing Category             |");	
	  System.out.println("+---------------------------------------------+");
	  System.out.print("Enter Lease amount : ");
	   int leaseAmount = getKeybordInput();  
	  System.out.print("Enter annual interest rate : ");	
	   int interestRate = getKeybordInput();	
	 
	  for (int j = 3; j <=5; j++)
	  {
        double i=(double)interestRate/12;
	    int n=12*j;
	    double Pn = Math.pow((1+i),n);
	    double monthlyInstallment=(double)leaseAmount*i /(1-(1/Pn)); 
	    System.out.println("Your monthly Installment for "+j+" years leasing plan:-  "+monthlyInstallment);
	  }
		 System.out.print("Do you want to calculate another Leasing category ?(Y/N):");
	    char inputChar = getKeybordInputChar();
		if (inputChar=='y'| inputChar=='Y' ){
			searchLeasingPage();
			}else{
			clearConsole();
			leasingTaxPage();
	        }
	} 
	 //--------------------------end searchLeasingCategory--------------------
	 
	//----------------------start findLeasingCategory--------------
	
	public static void findLeasingPage(){
	 System.out.println("+---------------------------------------------+");	
	 System.out.println("|             Find Leasing Amount             |");	
	 System.out.println("+---------------------------------------------+");
	 System.out.print("Enter the monthly lease payment you can afford: ");	
	  int monthlyInstallment = getKeybordInput();
	 System.out.print("Enter number of years : ");
	  int years = getKeybordInput();	
	 System.out.print("Enter annual interest rate : ");	
	  int interestRate = getKeybordInput();	
	  double i=(double)interestRate/12;
	  int n=12*years;
	  double Pn = Math.pow((1+i),n);
      double leaseAmount = (double)monthlyInstallment*((1-(1/Pn))/i);
     System.out.println("You can get lease amount : "+leaseAmount);	
		
	 System.out.print("Do you want to calculate find Leasing Amount ?(Y/N):");	
        char inputChar = getKeybordInputChar();
		if (inputChar=='y'| inputChar=='Y' ){
			findLeasingPage();
			}else{
			clearConsole();
			leasingTaxPage();
	        }
		}
	
}	
										 
	
	
 
