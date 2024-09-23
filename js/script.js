
function buscarDados() {
    fetch('api.php') 
        .then(response => {
            if (!response.ok) {
                throw new Error('Erro na rede');
            }
            return response.json(); 
        })
        .then(data => {
            console.log(data); 
        })
        .catch(error => {
            console.error('Erro:', error);
        });
}


buscarDados();
