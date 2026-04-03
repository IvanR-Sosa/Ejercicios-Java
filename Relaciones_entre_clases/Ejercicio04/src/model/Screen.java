package model;

import java.util.Arrays;

public class Screen {
        private String [] column = {"8","7","6","5","4","3","2","1"};
        private String [] row = {"A","B","C","D","E","F"};
        
        private Boolean [][] seats;
        

    public Screen() {
        seats = new Boolean[column.length][row.length];
        
    }

    public Boolean[][] getSeats() {
        return seats;
    }

    public void setSeats(Boolean[][] seats) {
        this.seats = seats;
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
