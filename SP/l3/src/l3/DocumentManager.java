package l3;

import java.util.Stack;

public class DocumentManager {

	private static DocumentManager instance = null;
	private Stack<Command> history = new Stack<Command>();
	Book book;
	FirstObserver firstObserver = new FirstObserver();
	SecondObserver secondObserver;
	Section sectiune;

	private DocumentManager() {}

	public static DocumentManager getInstance() {
		
		if(instance == null)
			instance = new DocumentManager();
		return instance;
	}


	public Command getHistory() {
		Command c = this.history.peek();
		this.history.pop();
		return c;
	}
	public void setHistory(Command history) {
		this.history.push(history);
	}

	public Book GetBook()
	{
		return book;
	}

	public void SetBook(Book b)
	{
		book = b;
	}

	public FirstObserver getObserver1()
	{
		return firstObserver;
	}

	public void setSectiune(Section sectiune)
	{
		this.sectiune = sectiune;
	}
	public Section getSectiune()
	{
		return this.sectiune;
	}

}
