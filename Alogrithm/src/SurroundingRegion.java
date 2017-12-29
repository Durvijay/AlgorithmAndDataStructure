
public class SurroundingRegion {
//	["XOXOXO",   "XOXOXO","OXOXOX","XOXOXO","OXOXOX"	["XXXX","XOOX","XXOX","XOXX"]
//	 "OXOXOX",
//	 "XOXOXO",	["OOOOXX","OOOOOO","OXOXOO","OXOOXO","OXOXOO","OXOOOO"]
//	 "OXOXOX"]     ["OOO","OOO","OOO"]	["XOXX","OXOX","XOXO","OXOX","XOXO","OXOX"]
	public static void main(String[] args) {
		char board[][]={{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		char board2[][]={{'O','X','O','O'},{'O','O','X','O'},{'O','X','O','O'},{'O','O','O','O'}};
		char board3[][]={{'X','O','X','O','X','O'},{'O','X','O','X','O','X'},{'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};
		char board4[][]={{'X','O','X','O','X','O'},{'O','X','O','X','O','X'},{'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};
		char board1[][]={{'O','O','O','O','X','X'},{'O','O','O','O','O','O'},{'O','X','O','X','O','O'},{'O','X','X','O','X','O'},{'O','X','O','O','O','O'}};
		char board5[][]={{'X','O','X','O','X','O','O','O','X','O'},
				 {'X','O','O','X','X','X','O','O','O','X'},
				 {'O','O','O','O','O','O','O','O','X','X'},
				 {'O','O','O','O','O','O','X','O','O','X'},
			     {'O','O','X','X','O','X','X','O','O','O'},
				 {'X','O','O','X','X','X','O','X','X','O'},
				 {'X','O','X','O','O','X','X','O','X','O'},
				 {'X','X','O','X','X','O','X','O','O','X'},
				 {'O','O','O','O','X','O','X','O','X','O'},
				 {'X','X','O','X','X','X','X','O','O','O'}};
		solve(board5);
	}
	public static void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='O'){
           	 	 checkBoundary(board,i,0);
            }
            if(board[i][board[0].length-1]=='O'){
            	 checkBoundary(board,i,board[0].length-1);
            }
            
        }
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='O'){
            	 checkBoundary(board,0,i);
            }
            if(board[board.length-1][i]=='O'){
           	 	 checkBoundary(board,board.length-1,i);
            }            
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
            	if(board[i][j]=='O')
            		board[i][j]='X';
            	else if(board[i][j]=='*')
            		board[i][j]='O';
            	System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static void checkBoundary(char[][] board, int i, int j) {
    	board[i][j]='*';
		if(i+1!=board.length && board[i+1][j]=='O'){
			checkBoundary(board, i+1, j);
		}
		if(j+1!=board[0].length && board[i][j+1]=='O'){
			checkBoundary(board, i, j+1);
		}
    	
		if(i!=0 && board[i-1][j]=='O'){
			checkBoundary(board, i-1, j);
		}
		if(j!=0 && board[i][j-1]=='O'){
			checkBoundary(board, i, j-1);
		}	
	}

	
}