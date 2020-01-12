package l3;

public class StatisticCommand implements Command{
	@Override
    public void Execute() {
        BookStatistics statistics = new BookStatistics();

        Book newBook = DocumentManager.getInstance().GetBook();

        DocumentManager.getInstance().GetBook().Accept(statistics);
    }

	@Override
	public void unExecute() {
		// TODO Auto-generated method stub
		
	}
}
