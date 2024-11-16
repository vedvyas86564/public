package com.org.dl.components.applicant.inforetriever.converter.dao;

import java.util.List;

public interface IAddressVerificationDao<E> {
public List<E> getAll(String uri);
public void delete(E e);
public void update(E e);
}
