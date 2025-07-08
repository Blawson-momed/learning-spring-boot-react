import { useState } from 'react'
import "./Counter.css"
import CounterButton from "./CounterButton"
import ResetButton from "./ResetButton"


export default function Counter(){
        const [count, setCount] = useState(0)

        function incrementCounterParentFunction(by){
                setCount(count+by)
        }

        function decrementCounterParentFunction(by){
                setCount(count-by)
        }

        function ResetCounterParentFunction(){
                setCount(count-count)
                // OR
                //setCount(0)
        }

        return(
                <>
                        <CounterButton by={1} 
                                incrementCounterParentFunction={incrementCounterParentFunction} 
                                decrementCounterParentFunction={decrementCounterParentFunction}
                        />
                        <CounterButton by={2} 
                                incrementCounterParentFunction={incrementCounterParentFunction} 
                                decrementCounterParentFunction={decrementCounterParentFunction} 
                        />
                        <CounterButton by={5} 
                                incrementCounterParentFunction={incrementCounterParentFunction} 
                                decrementCounterParentFunction={decrementCounterParentFunction} 
                        />
                        <span className="count">{count}</span><br/>
                        <ResetButton ResetCounterParentFunction={ResetCounterParentFunction}/>
                
                </>
        )
    }




