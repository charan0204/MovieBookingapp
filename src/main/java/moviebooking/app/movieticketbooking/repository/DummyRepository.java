// package moviebooking.app.movieticketbooking.repository;

// import org.springframework.data.repository.CrudRepository;

// // import moviebooking.app.movieticketbooking.entity.Dummy;

// public interface DummyRepository extends CrudRepository<Dummy,Integer> {
//     public Dummy findById(int id);  
// }
package moviebooking.app.movieticketbooking.repository;

import org.springframework.data.repository.CrudRepository;
// import com.example.movieticketbooking.entity.Dummy;

import moviebooking.app.movieticketbooking.entity.Dummy;

public interface DummyRepository extends CrudRepository<Dummy, Integer>{
    public Dummy findById(int id);
}