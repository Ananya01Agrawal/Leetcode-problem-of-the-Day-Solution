class Solution {
    public int distanceTraveled(int im, int aim) {

        int awer=0;//initialising answer as zero
        
        while(im>=5)//putting in while condition
        {
            im-=5;

            awer+=50;

            if(aim>0){

                im+=1;

                aim--;
            }

            else continue;
        }

        int mun=im*10;

        awer+=mun;

        return awer;
    }
}
