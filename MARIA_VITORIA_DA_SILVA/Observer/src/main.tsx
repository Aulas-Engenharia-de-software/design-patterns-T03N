import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
/*import AppComObserver from './observer/App.tsx'*/
import AppSemObserver from './sem_observer/App.tsx'

createRoot(document.getElementById('root')!).render(
  <StrictMode>
   {/* <AppComObserver />*/}
    <AppSemObserver />
  </StrictMode>,
)
