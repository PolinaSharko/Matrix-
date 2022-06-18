public class Matrix{
		private int size = 0;
		private int[][] mtx= new int[size][size];

	Matrix(int n){
		size = n;
		mtx = new int[size][size];
		for (int i = 0; i < size; i++){
				mtx[i][i] = 1;
              }		
	}

	public int getElement(int row, int column){
		return mtx[row][column];
	}

	public void setElement(int row, int column, int value){
		mtx[row][column]=value;
	}

	public Matrix sum(Matrix m){		
	 	 Matrix res = new Matrix(size); 
			for (int i = 0; i < size; i++){
				for (int j = 0; j < size; j++){
				   res.mtx[i][j] = m.mtx[i][j] + mtx[i][j];
				}
			} 	
	return res;	
	}

	public Matrix product(Matrix m){
	  Matrix res = new Matrix(size); 
	  for (int i = 0; i < size; ++i){	
    		for (int j = 0; j < size; ++j){
			int tmp = 0;	
      			for (int k = 0; k < size; ++k){
       				 tmp += mtx[i][k] * m.mtx[k][j];
				 res.mtx[i][j] = tmp;
			}
		}
	}
	return res; 
	}

	public Matrix shuffleRows(){
	  Matrix res = new Matrix(size);
           for (int i=0; i < size; i++){
           	for (int j=0; j < size; j++){
	  	res.mtx[i][j] = mtx[i][j];
		}
	   }
           for (int i=0; i < size; i++){   
              int first = (int)((Math.random()*(size))+0);
	      int second = (int)((Math.random()*(size))+0);
	      int[] tmp = res.mtx[first];
	      res.mtx[first]=res.mtx[second];
	      res.mtx[second]=tmp;
	 }
            return res;
       }


	public String toString(){
	StringBuilder build = new StringBuilder();
	for (int i = 0; i < size; i++){
			for (int j = 0; j < size; j++){
			  build.append(this.getElement(i,j)).append(" ");		                }
          build.append("\n");
	}				
	return build.toString();
	}
	
}