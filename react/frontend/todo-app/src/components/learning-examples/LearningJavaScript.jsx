const person = {
    name:'bobby Lawson',
    address: {
        line1: '123 baker st, london',
        city: 'London',
        country: 'UK'
    },
    profiles: ['twitter','linkedin','instagram'],
    printProfile: ()=>{
        person.profiles.map(
            (profile) => {
                console.log(profile)
            }
        )
        console.log(person.profiles[1])
    }
}


export default function LearningJavaScript(){
    return(
        <>
            <div>{person.name}</div>
            <div>{person.address.line1}</div>
            <div>{person.address.city}</div>
            <div>{person.address.country}</div>
            <div>{person.profiles[0]}</div>
            <div>{ person.printProfile() }</div>
        </>
    )
}