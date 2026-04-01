package com.task_management_system.TMS.Repository;

import com.task_management_system.TMS.Enum.StatusEnum;
import com.task_management_system.TMS.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    @Query(value = "select * from task_info where user_id = :userId and task_id= :taskId", nativeQuery = true)
    Optional<Task> findTaskByUserId(@Param("userId") long userId,
                                    @Param("taskId") long taskId);

    @Query(value = "select * from task_info where user_id = :userId AND status <> 'COMPLETED' AND due_date < CURDATE()", nativeQuery = true)
    List<Task> findAllDueByUserId(@Param("userId") long userId);

    @Query(value = "select * from task_info where user_id = :userId AND due_date = CURDATE() AND status <> 'COMPLETED'", nativeQuery = true)
    List<Task> findAllByDueToday(@Param("userId") long userId);

    @Query(value = "select * from task_info where status = :status AND user_id = :userId", nativeQuery = true)
    List<Task> findAllByUserIdAndStatus(@Param("userId") long userId, @Param("status") String status);
}
