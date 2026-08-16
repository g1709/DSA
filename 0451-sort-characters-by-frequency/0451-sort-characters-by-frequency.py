class Solution(object):
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        freq = Counter(s)
        sorted_chars = freq.most_common()

        result = ""
        for char, count in sorted_chars:
            result += char * count
        
        return result