import { FormEvent, JSXElementConstructor } from "react"

export default function Editor() {
    async function onSubmit(event: FormEvent<HTMLFormElement>) {
        const res = await fetch('http://localhost:6969/benchmark', {
            method: 'GET',
            headers: {
              'Content-Type': 'application/json'
            },
          })
          const data = await res.json()
    }
    return (
        <form onSubmit={(event) => onSubmit(event)} className="flex flex-col">
            <label>Language</label>
            <input type="checkbox"></input>
            <label>Code</label>
            <input type="text"></input>
            <button className="" type="submit">Submit</button>
        </form>
    )
}

async function postBenchmark() {
    
      return NextResponse.json(data)
}