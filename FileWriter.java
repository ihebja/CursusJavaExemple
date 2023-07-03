class FileWrite {
	public static void whenWriteStringUsingBufferedWritter_thenCorrect() 
  		throws IOException {
    		String str = "Hello";
    		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    		writer.write(str);
    
    		writer.close();
	}
	private void writeToPosition(String filename, int data, long position) 
  		throws IOException {
    		RandomAccessFile writer = new RandomAccessFile(filename, "rw");
    		writer.seek(position);
    		writer.writeInt(data);
   		writer.close();
	}


}
