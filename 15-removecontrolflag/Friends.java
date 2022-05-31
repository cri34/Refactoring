package xxx.refactorings.removecontrolflag;


public class Friends {
	private String[] friends;
	
	public Friends (String[] friends) {
		this.friends = friends;
	}
	
	public int indexOf (String friend) {
		int i = 0;
		
		while (i < friends.length) {
			  if (friends[i].equals(friend)) {
			    return (i-1);
			  }
			  i++;
			}
			return -1;
		}
	}
}
