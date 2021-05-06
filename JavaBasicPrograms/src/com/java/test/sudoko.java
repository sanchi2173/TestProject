package com.java.test;

import java.util.HashMap;

public class sudoko {

    public static void main(String[] args) {
        char[][] grid = {{'.','.','.','.','.','.','.','.','2'},
                {'.','.','.','.','.','.','6','.','.'},
                {'.','.','1','4','.','.','8','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.','.'},
                {'.','.','.','.','3','.','.','.','.'},
                {'5','.','8','6','.','.','.','.','.'},
                {'.','9','.','.','.','.','4','.','.'},
                {'.','.','.','.','5','.','.','.','.'}};

        System.out.println(sudoko.sudoko1(grid));
    }

    public static boolean sudoko1(char[][] grid) {

        HashMap<Character, Integer> rowDataMap = new HashMap<>();
        HashMap<Character, Integer> colDataMap = new HashMap<>();

        boolean isSudoko=true;

        for(int i=0; i<grid.length-1; i++){
            rowDataMap.clear();
            colDataMap.clear();
            for(int j=0; j<grid[i].length-1; j++){
                if(grid[i][j]!='.'){
                    char ch=grid[i][j];
                    if(rowDataMap.containsKey(ch)){
                        isSudoko=false;
                        break;
                    }
                    rowDataMap.put(ch, 1);
                }

                if(grid[j][i]!='.'){
                    char ch=grid[j][i];
                    if(colDataMap.containsKey(ch)){
                        isSudoko=false;
                        break;
                    }
                    colDataMap.put(ch, 1);
                }
            }
        }


        for(int i=0; i<=grid.length-1; i=i+3){
            colDataMap.clear();
            for(int j=0; j<=grid[i].length-1; j=j+3){

                for(int k=0; k<=2; k++){
                    for(int h=0; h<=2; h++){
                        if(grid[i+k][j+h] != '.'){
                            char ch=grid[i+k][j+k];
                            if(colDataMap.containsKey(ch)){
                                isSudoko=false;
                                break;
                            }
                            colDataMap.put(ch, 1);
                        }
                    }

                }

            }
        }

        return isSudoko;
    }

}
