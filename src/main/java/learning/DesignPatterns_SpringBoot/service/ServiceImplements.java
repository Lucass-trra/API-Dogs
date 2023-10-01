package learning.DesignPatterns_SpringBoot.service;

public interface ServiceImplements<A> {

    Iterable<A> searchAll();
    A searchForId(Long id);

    void insert(A a);

    void update(Long id, A a);

    void delete(Long id);
}
