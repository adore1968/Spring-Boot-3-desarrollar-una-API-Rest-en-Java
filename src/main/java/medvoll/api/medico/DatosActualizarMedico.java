package medvoll.api.medico;

import jakarta.validation.constraints.NotNull;
import medvoll.api.direccion.DatosDireccion;

public record DatosActualizarMedico(
        @NotNull
        Long id,
        String nombre,
        String documento,
        DatosDireccion direccion
) {
}
