public class JumpGame
{
        public boolean canJump(int[] nums) 
        {
            int LastIndexPosition=nums.length-1;
            for(int i=nums.length-1;i>=0;i--)
            {
                if(i+nums[i]>=LastIndexPosition)
                {
                    LastIndexPosition=i;
                }
            }
            return LastIndexPosition==0;
        }
    }