package com.example.painting.bot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.painting.bot.dto.User;
import com.example.painting.bot.repository.IUserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService extends BaseService {

    // beans
    protected final IUserRepository repo;

    /**
     * Возвращает список записей
     *
     * @return список записей
     * @throws DbException в случае ошибки БД
     */
    public List<User> getUserList() {
        log.trace("#### getUserList() - working");
        return wrapResults(repo.getUserList());
    }

    /**
     * Возвращает список записей по id
     *
     * @throws DbException в случае ошибки БД
     */
    public User getById(int id) {
        log.trace("#### getById() [id={}]", id);
        return wrapResult(repo.getById(id));
    }

    /**
     * Вставка новой записи
     *
     * @param entity новая запись
     * @throws DbException в случае ошибки БД
     */
    public void insert(User entity) {
        log.trace("#### insert() [entity={}]", entity);
        repo.insert(entity);
    }

    /**
     * Удаление записи
     *
     * @param entity удаляемая запись
     * @throws DbException в случае ошибки БД
     */
    public void delete(User entity) {
        log.trace("#### delete() [entity={}]", entity);
        repo.delete(entity);
    }

}
