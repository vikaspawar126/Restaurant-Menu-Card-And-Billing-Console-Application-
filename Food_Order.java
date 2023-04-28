import java.util.*;
public class Food_Order {

	public static void getOrder()
	{
		String food[] = {"Roti", "Rice", "Paneer", "Sev", "DalFry", "Poori", "Kajukari"};
		int price[] = {10,40,80,50,70,30,90};
	
		System.out.println("Welcome For Food Order");
		System.out.println();
		
		for(int i=0; i<food.length; i++)
		{
			System.out.println(food[i]+"="+price[i]);
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How much order food:");
		int n = sc.nextInt();
		int sum=0;
		int count = 1;
		
		//condition
		if(n<=7)
		{
			//for inserting food
			for(int i=1; i<=n; i++)
			{
				System.out.println("Enter food "+i);
				String search = sc.next();
				
			//searching food
				for(int j=0; j<food.length; j++)
				{
					if(food[j].equalsIgnoreCase(search))
					{
						count = 1;
						sum=sum+price[j];
						System.out.println(food[j]+" is added ");
						break;
					}
					else
					{
						count = 0;
					}
				}
					if(count==0)
					{
						System.out.println("sorry this food is not avialable");
					}
					
				}
				
			}
			System.out.println("Total amount of your order ="+sum);
		}
	}

