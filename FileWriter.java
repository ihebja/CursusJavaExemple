class FileWrite {
	public static void whenWriteStringUsingBufferedWritter_thenCorrect() 
  		throws IOException {
    		String str = "Hello";
    		BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
    		writer.write(str);
    
    		writer.close();
}



}
