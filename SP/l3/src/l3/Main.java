package l3;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Section cap11 = new Section("Capitolul 1");
		cap11.add(new Paragraph("Moto capitol"));
		cap11.add(new Paragraph("Another One"));
		cap11.add(new Paragraph("Another Two"));
		cap11.add(new Paragraph("Another Three"));
		DocumentManager.getInstance().setSectiune(cap11);
		System.out.println("Book Content: ");
		DocumentManager.getInstance().getSectiune().print();

		new DeleteCommand().Execute();
		System.out.println("Book Content after the first delete: ");
		DocumentManager.getInstance().getSectiune().print();
		new DeleteCommand().Execute();
		System.out.println("Book Content after the second delete: ");
		DocumentManager.getInstance().getSectiune().print();

		Command undoCommand = new UndoCommand();
		undoCommand.Execute();
		System.out.println("Book Content after first undo: ");
		DocumentManager.getInstance().getSectiune().print();
		undoCommand.Execute();
		System.out.println("Book Content after second undo: ");
		DocumentManager.getInstance().getSectiune().print();

		
	}

}
