package driver;

 class main {
	 public static void main(String[] args) {
		 HashTable_Chaining hash = new HashTable_Chaining(10);
		 hash.HashInsert(10, 10);
		 hash.HashInsert(20, 20);
		 hash.HashInsert(11, 11);
		 hash.HashInsert(22, 22);
		 hash.HashInsert(0, 0);
		 hash.HashInsert(5, 5);
		 hash.HashInsert(9, 9);
		 hash.HashInsert(13, 13);
		 hash.HashInsert(15, 15);
		 hash.HashInsert(17, 17);
		 System.out.println(hash);
	 }
	
	
}
