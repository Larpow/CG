package com.cgvsu.andreeva_m_n.cg.task_3;

// Это заготовка для собственной библиотеки для работы с линейной алгеброй
public class Vector2f {
    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float x, y;

    public String coordstoStringSplitBySpace() {
        return x+" "+y;
    }
}
