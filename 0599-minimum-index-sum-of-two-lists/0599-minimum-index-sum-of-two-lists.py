class Solution:
    def findRestaurant(self, list1: List[str], list2: List[str]) -> List[str]:
        mini = float('inf')
        word = []
        for i in range(len(list1)):
            for j in range(len(list2)):
                 if list1[i] == list2[j]:

                    if i + j < mini:
                        mini = i + j
                        word = [list1[i]]

                    elif i + j == mini:
                        word.append(list1[i])
        return word
