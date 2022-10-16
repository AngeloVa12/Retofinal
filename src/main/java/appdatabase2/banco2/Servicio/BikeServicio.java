package appdatabase2.banco2.Servicio;



import appdatabase2.banco2.Modelo.Bike;
import appdatabase2.banco2.Repositorio.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BikeServicio {


    @Autowired
    private BikeRepository bikeRepository;

    public List<Bike> getAll(){
        return bikeRepository.getAll();
    }
    public Optional<Bike> getBike(int id){
        return bikeRepository.getBike(id);
    }
    public Bike save(Bike bk){
        if(bk.getId()==null){
            return bikeRepository.save(bk);
        }else{
            Optional<Bike> b = bikeRepository.getBike(bk.getId());
            if(b.isPresent()){
                return bk;
            }else{
                return bikeRepository.save(bk);
            }
        }
    }

}
