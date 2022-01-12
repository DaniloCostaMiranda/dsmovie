import {ReactComponent as Estrelacheia} from 'assets/img/Estrelacheia.svg';
import {ReactComponent as Estrelamedia} from 'assets/img/Estrelamedia.svg';
import {ReactComponent as Estrelavazia} from 'assets/img/Estrelavazia.svg';
import './styles.css';

function MovieStars() {
    return(
        <div className="dsmovie-stars-container">
  <Estrelacheia />
  <Estrelacheia />
  <Estrelacheia />
  <Estrelamedia />
  <Estrelavazia />
</div>
    );
}

export default MovieStars;