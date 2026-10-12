package software.ulpgc.chess;

public record Square (File file, Rank rank) {
    public static Square at (String square){
        return new Square(File.getFile(square.charAt(0)), Rank.getRank(Character.getNumericValue(square.charAt(1))));
    }


    private  static class ParseException extends Exception {
        public ParseException (String message){

        }
    }
}
