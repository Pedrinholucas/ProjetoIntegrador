import Image from 'next/image'

let itens: any[] = [1, 2, 3, 4, 5, 6, 7, 8, 9];

function Celula(num: number){
   return <div className=' w-56 '>
        <img src='https://th.bing.com/th?id=OIP.4BhR9PjIcitbMkA6UYideAHaHa&w=250&h=250&c=8&rs=1&qlt=90&o=6&dpr=1.5&pid=3.1&rm=2'/>
        <h1>Sans Undertale said {num}</h1>

    </div>
}

export default function HomeTable(){
    return(<div className='mx-5 grid grid-cols-5'>{itens.map(item => Celula(item))}</div>)
}