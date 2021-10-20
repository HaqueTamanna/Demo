package f_lab_01;

public class BookShop {

	private String name;
	private TextBook [] textbooks=new TextBook[100];
	private StoryBook [] storybooks=new StoryBook[100] ;
	
	public BookShop()
	{
		
	}
	
	public BookShop(String name)
	{
		this.name=name;
		
	}
	public void SetName(String name)
	{
		this.name=name;
	}
	public String GetName()
	{
		return this.name;
	}
	
	
	public boolean Inseart_Textbook(TextBook textbook_obj)
	{	
		boolean result=false;
		
		for(int i=0;i<this.textbooks.length;i++)
		{
			if(textbooks[i]==null)
			{
				textbooks[i]=textbook_obj;
				result=true;
				break;
			}

		}
		return result;
	}
	

	public boolean Remove_Textbook(TextBook textbook_obj)
	{	
		boolean result=false;
		
		for(int i=0;i<this.textbooks.length;i++)
		{
			if(textbooks[i].getAuthorName() == textbook_obj.getAuthorName())
			{
				textbooks[i]=null;
				result=true;
				break;
			}
			else
			{
				result=false;
				continue;
				
				
			}

		}
		return result;
	}
	
	
	public TextBook TextBook_Search(String isbn)
	{
		 TextBook result = null;
		 
			for(int i=0;i<this.textbooks.length;i++)
			{	
				if(textbooks[i]!=null && textbooks[i].getIsbn() == isbn)
				{
					//System.out.println("The book has found!!");
					result=textbooks[i];
					break;
				}
				
				else
				{	result=null;
					continue;
				}
			}
			
			
			if(result==null)
			{
				System.out.println("Book is not Found!!!!\n");
			}
			else
			{
				System.out.println("Book is  Found!!!!\n");
			}
		
			return result;
		
		
	}
	
	
	public void Show_AllTextBooks()
	{	
		//TextBook counter=null;
		
		for(int i=0;i<this.textbooks.length;i++)
		{
				if(textbooks[i]==null)
				{
					continue;
					
				}
				else
				{
					textbooks[i].showDetails();	
				}
			        
			
		}
	}
	







//************************Storybook***********************
	
	public boolean Inseart_Storybook(StoryBook storybook_obj)
	{	
		boolean result=false;
		
		for(int i=0;i<this.storybooks.length;i++)
		{
			if(storybooks[i]==null)
			{
				storybooks[i]=storybook_obj;
				result=true;
				break;
			}

		}
		return result;
	}
	

	public boolean Remove_Storybook(StoryBook storybook_obj)
	{	
		boolean result=false;
		
		for(int i=0;i<this.storybooks.length;i++)
		{
			if(storybooks[i].getAuthorName() == storybook_obj.getAuthorName())
			{
				storybooks[i]=null;
				result=true;
				break;
			}
			else
			{
				result=false;
				continue;
				
				
			}

		}
		return result;
	}
	
	
	public StoryBook StoryBook_Search(String isbn)
	{
		 StoryBook result = null;
		 
			for(int i=0;i<this.storybooks.length;i++)
			{	
				if(storybooks[i]!=null && storybooks[i].getIsbn() == isbn)
				{
					//System.out.println("The book has found!!");
					result=storybooks[i];
					break;
				}
				
				else
				{	result=null;
					continue;
				}
			}
			
			
			if(result==null)
			{
				System.out.println("Book is not Found!!!!\n");
			}
			else
			{
				System.out.println("Book is  Found!!!!\n");
			}
		
			return result;
		
		
	}
	
	
	public void Show_AllStoryBooks()
	{	
		//TextBook counter=null;
		
		for(int i=0;i<this.storybooks.length;i++)
		{
				if(storybooks[i]==null)
				{
					continue;
					
				}
				else
				{
					storybooks[i].showDetails();	
				}
			        
			
		}
	}










}
