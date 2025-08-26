class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int m_area=0;
        int m_diag=0;
        for(int i=0;i<dimensions.length;i++){
            int length=dimensions[i][0];
            int b=dimensions[i][1];
            int dia=length*length+b*b;
            int area = length*b;
            if(dia>m_diag||(dia==m_diag&&area>m_area)){
                m_diag=dia;
                m_area=area;
            }
        }
        return m_area;
        
    }
}