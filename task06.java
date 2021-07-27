class Task06 {
    public static void main(String[] args) {
        System.out.println(maximum(1, 2, 3));
        System.out.println(maximum(1, 22, 3, 2));    
    }

    public static int maximum(int... numbers) {
        int max = numbers[0];
        int index = 1;
        while (index < numbers.length){
            if (numbers[index] > max)
                max = numbers[index];
            index++;
        }
        return max;
    }
}

// maximum(num1, num2, num3):
//     num_lst = [num1, num2, num3]
//     maxm = num1
//     index = 1
//     while index < len(num_lst):
//         if (num_lst[index] > maxm):
//             maxm = num_lst[index]
//         index +=1
//     return maxm