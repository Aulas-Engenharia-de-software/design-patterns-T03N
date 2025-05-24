import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
/*import AppUsando from './Usando_Factory_Method/App.tsx'*/
import AppSem from './Sem_Factory_Method/App.tsx'


createRoot(document.getElementById('root')!).render(
  <StrictMode>
    {/*<AppUsando />*/}
    <AppSem />
  </StrictMode>,
)
