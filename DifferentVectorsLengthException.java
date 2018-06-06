public class DifferentVectorsLengthException extends Exception {

  private int length1, length2;

  public DifferentVectorsLengthException(){
  }

  public DifferentVectorsLengthException(String message) {
    super(message);
  }

	public DifferentVectorsLengthException(String message, int len1, int len2) {
		super(message);
		this.length1 = len1;
    this.length2 = len2;
	}

  public int getLength1() {
    return length1;
  }

  public int getLength2() {
    return length2;
  }
}
