package reader

class FilesReader {
    static void readFileLineByLine(String filePath) {
        File file = new File(filePath)
        def line  = 0;
        file.withReader { reader ->
            while ((line = reader.readLine()) != null) {
                println(line)
            }
        }
    }

    static void main(String[] args) {
        String path = '/home/user/Documents/linux/comands'
        readFileLineByLine(path)
    }

}
