package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    public boolean theSameAs(T objectT);

    @Override
    public boolean equals(Object object);
}
