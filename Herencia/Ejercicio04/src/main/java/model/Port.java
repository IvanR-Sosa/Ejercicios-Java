package model;

public class Port {


 private String [] column = {"8","7","6","5","4","3","2","1"};
        private String [] row = {"A","B","C","D","E","F"};
        
        private Boolean [][] berth;
        

    public Port() {
        berth = new Boolean[column.length][row.length];
        
    }   

    public Boolean[][] getBerth() {
        return berth;
    }

    public void setBerth(Boolean[][] berth) {
        this.berth = berth;
    }

    public String[] getColumn() {
        return column;
    }

    public void setColumn(String[] column) {
        this.column = column;
    }

    public String[] getRow() {
        return row;
    }

    public void setRow(String[] row) {
        this.row = row;
    }
    
}
