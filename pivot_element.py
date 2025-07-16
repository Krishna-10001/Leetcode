def pivot_index(nums):
    total_sum = sum(nums)
    left_sum = 0

    for i, num in enumerate(nums):
        right_sum = total_sum - left_sum - num

        if left_sum == right_sum:
            return i

        left_sum += num

    return -1

nums = [9,1,3,3,3]
n = [2,1,-1]
print (pivot_index(nums))
print (pivot_index(n))