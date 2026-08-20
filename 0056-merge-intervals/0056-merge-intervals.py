class Solution(object):
    def merge(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        intervals.sort(key=lambda x: x[0]) 
        start = intervals[0][0]
        end = intervals[0][1]

        answer=[]

        for i in range(1, len(intervals)):
           
            s = intervals[i][0]
            e = intervals[i][1]

            if end >= s:
                end = max(end, e)

            else:
                answer.append([start, end])
                start = s
                end = e

            
        answer.append([start, end])
        return answer

