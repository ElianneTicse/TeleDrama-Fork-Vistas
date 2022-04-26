function start() {
    barObra();
    barFuncion();
}

function barObra() {
    const ctx = document.getElementById('myChart').getContext('2d');
    const myChart = new Chart(ctx, configObra());
}

function barFuncion() {
    const ctx2 = document.getElementById('otraopcion').getContext('2d');
    const myChart2 = new Chart(ctx2, configFuncion());
}

function configObra() {
    return {
        type: 'bar',
        data: {
            labels: [
                'Las aventuras de Peter Castle',
                'Romeo y Julieta',
                'Hamlet',
                'Los 3 cerditos',
                'Misterios del Perú',
                'Fuente Ovejuna',
                'El pollo está Vivo o Muerto'
            ],
            datasets: [{
                axis: 'y',
                label: '% Asistencia: Función más vista',
                data: [65, 59, 80, 81, 79, 55, 95],
                fill: false,
                backgroundColor: 'rgba(75, 192, 192, 0.2)',
                borderColor: 'rgb(75, 192, 192)',
                borderWidth: 1
            },
                {
                    axis: 'y',
                    label: '% Asistencia: Función menos vista',
                    data: [15, 55, 40, 59, 71, 30, 91],
                    fill: false,
                    backgroundColor: 'rgba(255, 99, 132, 0.2)',
                    borderColor: 'rgb(255, 99, 132)',
                    borderWidth: 1
                }]
        },
        options: {
            indexAxis: 'y',
        }
    }
};

function configFuncion() {
    return {
        type: 'bar',
        data: {
            labels: [
                '12/04 - 8:30 pm',
                '13/04 - 9:00 pm',
                '14/04 - 10:30 pm',
                '15/04 - 5:00 pm',
                '16/04 - 4:45 pm',
                '17/04 - 3:35 pm',
                '19/04 - 8:30 pm'
            ],
            datasets: [{
                axis: 'y',
                label: '% Asistencia',
                data: [65, 59, 80, 81, 79, 55, 95],
                fill: false,
                backgroundColor:
                    [
                        'rgba(255, 99, 132, 0.2)',
                        'rgba(255, 159, 64, 0.2)',
                        'rgba(255, 205, 86, 0.2)',
                        'rgba(75, 192, 192, 0.2)',
                        'rgba(54, 162, 235, 0.2)',
                        'rgba(153, 102, 255, 0.2)',
                        'rgba(201, 203, 207, 0.2)'
                    ],
                borderColor:
                    [
                        'rgb(255, 99, 132)',
                        'rgb(255, 159, 64)',
                        'rgb(255, 205, 86)',
                        'rgb(75, 192, 192)',
                        'rgb(54, 162, 235)',
                        'rgb(153, 102, 255)',
                        'rgb(201, 203, 207)'
                    ],
                borderWidth: 1
            }]
        },
        options: {
            indexAxis: 'y',
        }
    }
};



