|      |                                                           | private | default | protected | public |
| :——— | :———                                                      | :———    | :———    | :———      | :———   |
| 1    | Один и тот же класс                                       |    +    |   +     |    +      |   +    |
| 2    | Подкласс, находящийся в том же пакете, что и суперкласс   |    -    |   +     |    +      |   +    |
| 3    | Класс из того же самого пакета, не являющийся подклассом  |    -    |   +     |    +      |   +    |
| 4    | Подкласс, находящийся в другом пакете                     |    -    |   -     |    +      |   +    |
| 5    | Класс из другого пакета, не являющийся подклассом данного |    -    |   -     |           |   +    |